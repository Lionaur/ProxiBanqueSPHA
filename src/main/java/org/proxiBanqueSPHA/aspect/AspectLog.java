package org.proxiBanqueSPHA.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class AspectLog {
	private static final Logger LOGGER = LoggerFactory.getLogger(AspectLog.class);

	@Around("logService()")
	public Object logTimeMethod(ProceedingJoinPoint joinPoint) throws Throwable {

		try {
			StopWatch stopWatch = new StopWatch();
			stopWatch.start();

			Object retVal = joinPoint.proceed();

			stopWatch.stop();

			StringBuffer logMessage = new StringBuffer();
			logMessage.append(joinPoint.getTarget().getClass().getName());
			logMessage.append(".");
			logMessage.append(joinPoint.getSignature().getName());
			logMessage.append("(");

			// append args
			Object[] args = joinPoint.getArgs();

			for (int i = 0; i < args.length; i++) {
				logMessage.append(args[i]).append(",");
			}

			if (args.length > 0) {
				logMessage.deleteCharAt(logMessage.length() - 1);
			}

			logMessage.append(")");
			logMessage.append(" execution time: ");
			logMessage.append(stopWatch.getTotalTimeMillis());
			logMessage.append(" ms");
			LOGGER.trace(logMessage.toString());
			return retVal;

		} catch (Throwable e) {
			StringBuffer logMessage = new StringBuffer();
			logMessage.append(joinPoint.getTarget().getClass().getName());
			logMessage.append(".");
			logMessage.append(joinPoint.getSignature().getName());
			logMessage.append(" ");
			logMessage.append(e.getMessage());
		}
		return null;
	}

	@Pointcut("execution(public * *(..))")
	public void log() {

	}

	@Pointcut("within(org.proxiBanqueSPHA.service..*)")
	private void inService() {

	}

	@Pointcut("log() && inService()")
	private void logService() {

	}
}
>>>>>>> c6ca186d77b991525aee9c68a82652f391fc0e04

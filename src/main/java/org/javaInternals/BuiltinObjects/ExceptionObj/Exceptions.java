package org.javaInternals.BuiltinObjects.ExceptionObj;

import static org.javaInternals.App.log;

class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
}
public class Exceptions {
    public Exceptions() {
        try {
            randomExceptionUsage("b");
        } catch (CustomException e) {
            log(e.getMessage());
            log(e.toString());
            log(e.getStackTrace());
            log(e.getCause());
            log(e.fillInStackTrace());
            log(e.getLocalizedMessage());
        }

        try {
            testingBuildInException();
        } catch (Exception e) {
            log(e);
        }
    }

    public String randomExceptionUsage(String letter) throws CustomException {
        if (letter.equals("b")) throw new CustomException("I expected \"a\" value to be received");
        return letter + letter + letter + "yeah! cuak...";
    }

    public void testingBuildInException() throws Exception {
        throw new Exception("this is a build in default exception");
    }
}

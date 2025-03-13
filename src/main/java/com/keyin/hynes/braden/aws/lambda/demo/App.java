package com.keyin.hynes.braden.aws.lambda.demo;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
public class App implements RequestHandler<
  // These classes can be anything.
  Object, // input class
  String // output class
> {
  // AWS Lambda functions written in Java start with handleRequest instead of PSVM. 
  @Override
  public String handleRequest(
    Object input,
    Context context
  ) {
    return "Hello World!";// Replace with your function logic.
  }
}
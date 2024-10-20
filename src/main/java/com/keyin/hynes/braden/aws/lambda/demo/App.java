package com.keyin.hynes.braden.aws.lambda.demo;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
public class App implements RequestHandler<
  // These classes can be anything.
  Object, // input class
  String // output class
> {
  public App() {}
  // AWS Lambda functions written in Java don't use a PSVM.
  @Override
  // The output has to be of the same class declared above.
  public String handleRequest(
    Object input,
    Context context
  ) {
    return "Hello World!";// Replace with your function logic.
  }
}
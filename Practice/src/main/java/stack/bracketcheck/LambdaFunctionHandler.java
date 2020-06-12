package stack.bracketcheck;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class LambdaFunctionHandler implements RequestHandler<Object, String> {

	public String handleRequest(Object input, Context context) {
		context.getLogger().log("Input: " + input);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		BracketChecker.reversedBrackets.put("(", ")");
		BracketChecker.reversedBrackets.put("[", "]");
		BracketChecker.reversedBrackets.put("{", "}");

		JsonElement jsonElement = gson.toJsonTree(input);

		JsonObject jsonObject = jsonElement.getAsJsonObject();
		return BracketChecker.validateBracketSequence(jsonObject.get("brackets").getAsString());
	}

}

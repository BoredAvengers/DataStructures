package stack.bracketcheck;

import java.util.LinkedHashMap;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Object, String> {

	@Override
	public String handleRequest(Object input, Context context) {
		context.getLogger().log("Input: " + input);
		LinkedHashMap<String, String> map = (LinkedHashMap<String, String>) input;

		BracketChecker.reversedBrackets.put("(", ")");
		BracketChecker.reversedBrackets.put("[", "]");
		BracketChecker.reversedBrackets.put("{", "}");

		context.getLogger().log("brackets: " + map.get("brackets"));
		String brackets = map.get("brackets");

		String result = BracketChecker.validateBracketSequence(brackets);

		return result;
	}

}

package herbLang.herb;

import java.util.List;

class HerbFunction implements HerbCallable {
	private final Stmt.Function declaration;
	HerbFunction(Stmt.Function declaration) {
		this.declaration = declaration;
	}
	@Override
	public String toString() {
		return "<function " + declaration.name.lexeme + ">";
	}
	@Override
	public int arity() {
		return declaration.params.size();
	}
	@Override
	public Object call(Interpreter interpreter, List<Object> arguments) {
		Environment environment = new Environment(interpreter.globals);
		for (int i = 0; i < declaration.params.size(); i++) {
			environment.define(declaration.params.get(i).lexeme,arguments.get(i));
		}
		
		interpreter.executeBlock(declaration.body, environment);
		return null;
	}
}
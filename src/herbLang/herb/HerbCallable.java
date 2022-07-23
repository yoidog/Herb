package herbLang.herb;

import java.util.List;

interface HerbCallable {
	int arity();
	Object call(Interpreter interpreter, List<Object> arguments);
}
package herbLang.herb;

import java.util.List;

interface HerbCallable {
	Object call(Interpreter interpreter, List<Object> arguments);
}
package herbLang.herb;

class Interpreter implements Expr.Visitor<Object> {
	@Override
	public Object visitLiteralExpr(Expr.Literal expr) {
		return expr.value;
	}
}
package language.statements;

import language.Expression;
import language.Function;
import model.Program;

public class PrintStatement implements Statement {

	public PrintStatement(Expression expression) {
		this.expression = expression;
	}
	
	
	private Expression expression;
	
	
	
	private Function function; 
	
	
	@Override
	public Function getFunction() {
		return function;
	}

	@Override
	public Program getProgram() {
		return getFunction().getProgram();
	}

	
	@Override
	public void setFunction(Function function) {
		this.function = function;		
	}

	
	
	@Override
	public void compile() {
		getProgram().addOutput("DRU " + expression.evaluate());
	}

}
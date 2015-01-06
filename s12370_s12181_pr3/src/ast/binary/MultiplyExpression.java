package ast.binary;

import edu.pjwstk.jps.ast.IExpression;
import edu.pjwstk.jps.ast.binary.IMultiplyExpression;

public class MultiplyExpression extends BinaryExpression implements IMultiplyExpression {
	

	public MultiplyExpression(IExpression leftExpr, IExpression rightExpr){
		super(leftExpr, rightExpr);
	}
	
	public String toString(){
		return this.getLeftExpression().toString() + " * " +
				this.getRightExpression().toString();
	}
	
}

package jama;

import Jama.LUDecomposition;
import Jama.Matrix;

public class LUTest {
	
	
	public static void main(String[] args) {
		double[][]  array={{1.0,-1.0,3},{1.0,1.0,5},{4.0,7.5,-2}};
		Matrix m =new Matrix(array);
		m.print(3, 3);
		LUDecomposition lu =new LUDecomposition(m);
		Matrix l=lu.getL();
		Matrix u=lu.getU();
		double[] privot=lu.getDoublePivot();
		System.out.println(privot);
//	Matrix result=	l.solve(u);
//	result.print(result.getRowDimension(), result.getColumnDimension());
	}
}

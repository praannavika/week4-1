package week4;

public class Matrix {
//	public class Matrix {
		
		int m[][];
		
		public Matrix(Matrix mat2) {
			this.m=mat2.m;
		}

		public Matrix() {
			m=new int[3][3];
		}

		public Matrix(int a,int b) {
			m=new int[a][b];
		}
		
		public Matrix(int x[][]) {
			this.m=x;
		}
		
		private void multiply(int[][] x) {
			int c=x.length;
			int d=x[0].length;
			int a=m.length;
			int b=m[0].length;
			if(b!=c) {
				System.out.println("Multiplication is not possible");
				return;
			}
			System.out.println("Multiplying the matrices");
			int r[][]=new int[a][d];
			for(int i=0;i<a;i++) {
				for(int j=0;j<d;j++) {
					for(int k=0;k<b;k++) {
						r[i][j]+=m[i][k]*x[k][j];
					}
				}
			}
			display(r);
		}

		void scalar() {
			if(m.length!=m[0].length) {
				System.out.println("Given matrix is not a square matrix, hence not a scalar matrix");
				return;
			}
			int f=m[0][0];
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[i].length;j++) {
					if(i==j) {
						if(m[i][j]!=f) {
							System.out.println("Given Matrix is not scalar");
							return;
						}
					}
					else {
						if(m[i][j]!=0) {
							System.out.println("Given Matrix is not scalar");
							return;
						}
					}
				}
			}
			System.out.println("Given Matrix is scalar");
			
		}

		void display(int [][]a) {
			System.out.println("Displaying the Matrix: ");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		}

		void read() {
			System.out.println("Enter the matrix:");
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[i].length;j++) {
					m[i][j]=Read.br.nextInt();
				}
			}
			
		}
		void add(int[][] x) {
			int a=x.length;
			int b=x[0].length;
			if(a!=m.length || b!=m[0].length) {
				System.out.println("Cannot add the given matrices");
				return;
			}
			System.out.println("Adding the matrices");
			int r[][]=new int[a][b];
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					r[i][j]=x[i][j]+m[i][j];
				}
			}
			display(r);
			
		}

		public static void main(String[] args) {
			int x[][]= {{1,1,1},{2,2,2},{3,3,3}};
			Matrix mat=new Matrix();
			mat.read();
			mat.display(mat.m);
			mat.scalar();
			mat.add(x);
			mat.multiply(x);
			Matrix mat2=new Matrix(2,3);
			mat2.read();
			mat2.display(mat2.m);
			mat2.scalar();
			mat2.add(x);
			mat2.multiply(x);
			mat=new Matrix(mat2);
			mat.display(mat.m);
			mat.scalar();
			mat.add(x);
			mat.multiply(x);

		}

	}}

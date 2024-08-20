package ex02_Enum;
/*
 * enum은 데이터의 그룹화 및 관리에 용이
 * 데이터들이 서로 관련되어 있지만 관련된 형태를 구현하는데 있어 애로사항이 생긴다면
 * enum을 통해 한 클래스내애서 관리할수 있음
 */
public enum Operation {
	PULS("+") {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-"){
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},
	MULTI("*"){
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/"){
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	};
	
	private String oper;
	
	private Operation(String oper) {
		this.oper = oper;
	}
	
	public abstract double apply(double x, double y);
	
	public String getOper() {
		return oper;
	}
}

package ex03_anonymous_class;

interface ButtonClickListener{
	//기능은 메서드에다 만듦
	public void click();
	
}

public class AnonymousExample {
	public class Button{
		private ButtonClickListener listener;
		
		public void setButtonListener(ButtonClickListener listener) {
			this.listener = listener;
		}
		
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		//인터페이스 객체를 직접 만들수 없다
		//인터페이스를 구현한 클래스를 통해 객체를 만들수 있다.
		button.setButtonListener(new ButtonClickListener(){
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
			}
		});
		button.click();
	}
}

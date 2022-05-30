package Log;

public class LoggerTester {
	//logger가 실행되는지 테스트하는 클래스입니다.

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");
		
	}

}

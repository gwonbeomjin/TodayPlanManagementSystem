package Log;

public class LoggerTester {
	//logger�� ����Ǵ��� �׽�Ʈ�ϴ� Ŭ�����Դϴ�.

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");
		
	}

}

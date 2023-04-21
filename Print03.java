package days01;

public class Print03 {

	public static void main(String[] args) {
		
		System.out.printf("\t\t\t%s\n","###성적표###");
		System.out.printf("-------------------------------------------------------------\n");
		System.out.printf("%s\t%s\t\t%s\t%s\t%s\t%s\t%s\n", "번호", "성명", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("-------------------------------------------------------------\n");
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n", 1, "홍길동", 89, 87, 89, 89+87+89, (89+87+89)/3.0);
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n", 2, "홍길서", 87, 55, 87, 87+55+87, (87+55+87)/3.0);
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n", 3, "홍길남", 59, 88, 66, 59+88+66, (59+88+66)/3.0);
		System.out.printf("-------------------------------------------------------------\n");
	}

}

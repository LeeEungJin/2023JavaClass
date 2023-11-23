package JavaClassBasic;

public class Array2 {
	public static void main(String[] args) {
		String[] label = {"순번", "이름", "국어", "영어", "수학", "과학", "총점", "평균"};
		
		int[] num = {0, 1, 2, 3};
		String[] name = {"이민호", "이상재", "나재길", "탁재훈"};
		int[] kor = {71, 81, 91, 61};
		int[] eng = {72, 82, 92, 62};
		int[] mat = {73, 83, 93, 63};
		int[] sci = {74, 84, 94, 64};
		int[] total = new int[num.length];
		float[] ave = new float[num.length];
		
		int i=0;
		int j=0;
		
		for(i=0 ; i<num.length ; i++) {
			total[i] = kor[i] + eng[i] + mat[i] + sci[i];
		}
		
		for(i=0 ; i<num.length ; i++) {
			ave[i] = (int)((total[i]/(float)(label.length-2))*100+0.5f)/100f;
		}
		
		
		for(i=0 ; i<label.length ; i++) {
			System.out.print(label[i] + "\t");
		}
		System.out.println("");
				
		for(i=0 ; i<num.length ; i++) {
			System.out.println("  " + num[i] + "\t" + name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + sci[i] + "\t" + total[i] + "\t" + ave[i]);
		}
		
		
		
		
	}

}

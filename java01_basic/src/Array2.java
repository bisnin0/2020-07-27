class Array2 
{
	public static void main(String[] args) 
	{   //1�����迭(index�� �ϳ��ΰ�)

		//�迭 ���� ���
		int num[] = new int[10];
		int num2[]; //�޸� �Ҵ� �ȵ�

		
		num2 = new int[5]; // <-- �̷��� ���߿� �޸𸮸� �Ҵ� �� �� ����
		//num2�� �޸� �Ҵ��

		//�迭�� ���� �� �� �ʱⰪ �� �� �ִ�.
		int num3[] = {5,7,1,26,86}; //index�� 0~4���� ����ȴ�.
		for(int i=0; i<num3.length; i++){
			System.out.println("num3["+i+"]="+num3[i]);
		}
			
		int num4[] = new int[]{103,403,540,530,509};
		for(int i=0; i<num4.length; i++){
			System.out.println("num4["+i+"]="+num4[i]);
		}

		String[] names = new String[5];
		for(int i=0; i<names.length; i++){
			System.out.println("names["+i+"]="+names[i]);
		}

		String[] names2 = {"ȫ�浿", "��浿","�ڱ浿","�ֱ浿","���浿"};
		for(int i=0; i<names2.length; i++){
			System.out.println("names2["+i+"]="+names2[i]);
		}

	}
}
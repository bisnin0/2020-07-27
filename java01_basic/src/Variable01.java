class Variable01 
{
	public static void main(String[] args) 
	{	//�ּ� : ����
		/*
			������ �ּ���
			������ �ּ���
		*/
		//���� ���� = �⺻��������, ���۷�����(��ü��)
		//���� : byte(1byte), short(2byte), int(4byte:�������� �⺻Ÿ��), long(8byte)
		//���(����������...������� �̸�'ȫ�浿') :	100, 50
		//������ �ֱ����� ����� ��򰡿� �����ؾ��Ѵ�.
		//�������� ����       ���
		   byte korJumsu = 100;
		   int engJumsu = 50;
 			//�ռ����϶��� �ι�° �ܾ��� ù��° ���ڴ� �빮��
			//'='�� ���Թ�
			//���ɾ� ������ ������ ; �� ��������Ѵ�.
			int hap = korJumsu + engJumsu;

			//Ŭ����.����.�޼ҵ�  prunt():��� �� �� �ȹٲ�. println():��� �� �� �ٲ�(����Ʈ����), printf()  
            System.out.println(korJumsu);
            System.out.println(engJumsu);
            System.out.println(hap);

			System.out.println("����="+korJumsu); //����Ʈ���ο� �ΰ��� ���� ���� �� ����. �ϳ��� ���ľ��� '+'��
			System.out.println("����="+engJumsu);
			System.out.println("�հ�="+hap);
			//System = �ڹ� API (�̹� ������� �ִ°�)

			System.out.println(korJumsu+"+"+engJumsu+"="+hap);
			//"..." �� ���ڿ��̴�. 
			
			// byte num = 130; // ���� : byte �� �Ѱ谪 127�� �ʰ�
			byte num = (byte)130; // ū �����͸� ���������Ϳ� ������ ���� �� �ִ�. (byte�� ������ �� �ִ�.) => typecasting �̶�� �θ���.
			System.out.println("num="+num);  // ����� -126�� ��µȴ�.

			//byte���� -128~127������. 127 ���ĸ� ǥ���Ҷ��� -128�� ���ư���(���������ͷγѾ��) ǥ���Ѵ�.
			//ex) 126, 127, -128, -127, -126

			int num2 = num;
			System.out.println("num2="+num2);
			//���������� ���� ���ִ� ���� ū �����Ͱ��� �������� typecasting�� ���ص� �ȴ�.
	

	}
}
/*
���� ���� ��Ģ
1. ������ �ҹ��ڷ� �����Ѵ�.
2. ù��° ���ڴ� ����, _(�����), $�� �����ϴ�.(�׿ܿ��� ���������.)
3. Ư������(_, $�� ������ ������ ��ȣ��)�� ����� �� ����.
4. �ռ����϶��� �ι�° �ܾ��� ù��° ���ڴ� �빮�ڷ� �����Ѵ�.
*/
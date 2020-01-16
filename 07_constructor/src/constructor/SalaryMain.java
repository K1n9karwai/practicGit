package constructor;

import java.text.DecimalFormat;

public class SalaryMain {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###");
		SalaryDTO[] salary = new SalaryDTO[3];
		
		salary[0] = new SalaryDTO("ȫ�浿", "����", 5000000, 200000);
		salary[1] = new SalaryDTO("���缮", "����", 3500000, 150000);
		salary[2] = new SalaryDTO("�ڸ��", "���", 1800000, 100000);
		
		System.out.println("�̸�\t����\t�⺻��\t\t����  \t����\t����\t����");
		
//		for(int i=0; i<salary.length; i++) {
//		
// 		System.out.print(salary[i].getName()+"\t"+salary[i].getPosition()
// 				+"\t"+salary[i].getBasePay()+"\t"+salary[i].getBenefit()
// 				+"\t"+salary[i].getTaxRate()+"\t"+salary[i].getTax()+"\t"+salary[i].getSalary());
// 		System.out.println();
//		}	
//		
		for(SalaryDTO dto : salary) {
			dto.calc();
			System.out.println(dto.getName()+"\t"+dto.getPosition()
	 				+"\t"+df.format(dto.getBasePay())+"\t"+dto.getBenefit()
	 				+"\t"+dto.getTaxRate()+"\t"+dto.getTax()+"\t"+df.format(dto.getSalary()));
		}
	}
}

/*
�������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
��ü �迭�� �ۼ��Ͻÿ�
�����ڸ� ���ؼ� �����͸� �Է�
����� calc()
name, position, basePay, benefit, taxRate, tax, salary

���� = (�⺻�� + ����) * ����;
���� = �⺻�� + ���� - ����;

������ 200���� ���� : 1%(0.01), 
    400���� ���� : 2%(0.02), 
    400���� �ʰ� : 3%(0.03)���� �����Ѵ�.

[������]
�̸�		����		�⺻��		����		����		����		����
ȫ�浿		����		5000000		200000
���缮		����		3500000		150000
�ڸ��		���		1800000		100000
*/

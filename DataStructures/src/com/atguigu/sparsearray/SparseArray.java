package com.atguigu.sparsearray;

public class SparseArray {

	public static void main(String[] args) {
		// ����һ��ԭʼ�Ķ�ά���� 11*11
		// 0����ʾû�����ӣ�1 ��ʾ���� 2 ��ʾ����
		int chessArr1[][] = new int[11][11];
		chessArr1[1][2] = 1;
		chessArr1[2][3] = 2;
		// ���ԭʼ�Ķ�ά����
		System.out.println("ԭʼ�Ķ�ά����~~~~");
		for (int[] row : chessArr1) {
			for (int data : row) {
				System.out.printf("%d\t", data);// ����ʽ��� printf
			}
			System.out.println();
		}

		// ����ά���� ת ϡ�������˼·
		// 1. �ȱ�����ά���� �õ���0���ݸ���
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArr1[i][j] != 0) {
					sum++;

				}
			}
		}
		System.out.println("sum=" + sum);

		// 2. ������Ӧ��ϡ������
		int sparseArr[][] = new int[sum + 1][3];
		// ϡ�����鸳ֵ
		sparseArr[0][0] = 11;
		sparseArr[0][1] = 11;
		sparseArr[0][2] = sum;

		// ������ά���飬����0��ֵ��ŵ�sparseArr��
		int count = 0; // count ���ڼ�¼�ǵڼ�����0����
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArr1[i][j] != 0) {
					count++;
					sparseArr[count][0] = i;
					sparseArr[count][1] = j;
					sparseArr[count][2] = chessArr1[i][j];
				}
			}
		}
		// ���ϡ���������ʽ
		System.out.println();
		System.out.println("�õ�ϡ������Ϊ������ʽ~~~~");
		for (int i = 0; i < sparseArr.length; i++) {
			System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
		}
		System.out.println();

		// �� ϡ������ --�� �ָ���ԭʼ�Ķ�ά����
		/*
		 * 1.�ȶ�ȡϡ������ĵ�һ�У����ݵ�һ�е����飬����ԭʼ�Ķ�ά���飬��������� `chessArray =int[11][11]`
		 * 2.�ڶ�ȡϡ��������е����ݣ�������ԭʼ�Ķ�ά���鼴��
		 */
		// 1. �ȶ�ȡϡ������ĵ�һ�У����ݵ�һ�е����飬����ԭʼ�Ķ�ά����
		int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
		// ����ָ���Ķ�ά����
		System.out.println();
//		System.out.println("�ָ���Ķ�ά����");
		/*
		 * for(int[] row : chessArr2) { for(int data : row) {
		 * System.out.printf("%d\t",data);//����ʽ��� printf } System.out.println(); }
		 */
		// 2.�ڶ�ȡϡ��������е�����(�ӵڶ��п�ʼ)��������ԭʼ�Ķ�ά���鼴��
		for (int i = 1; i < sparseArr.length; i++) {
			chessArr2[sparseArr[i][0]][sparseArr[i][0]] = sparseArr[i][2];
		}
		// ����ָ���Ķ�ά����
		System.out.println();
		System.out.println("�ָ���Ķ�ά����");
		for (int[] row : chessArr2) {
			for (int data : row) {
				System.out.printf("%d\t", data);// ����ʽ��� printf
			}
			System.out.println();
		}

	}

}

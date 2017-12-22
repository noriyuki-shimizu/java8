package viewMethod;

import java.util.Arrays;
import java.util.List;

/**
 * ���\�b�h�Q�Ƃ�p�������W�b�N.
 * 
 * @author Noriyuki-Shimizu
 */
public class ProcessViewMethod {

	/** this�N���X */
	private static ProcessViewMethod processViewMethod = new ProcessViewMethod();
	
	/**
	 * �V���O���g���p�^�[��.
	 * 
	 * @return �C���X�^���X�����ꂽthis�N���X
	 */
	public static ProcessViewMethod getInstance() {
		return processViewMethod;
	}
	
	/**
	 * ���\�b�h�Q�Ƃł̏�������.
	 */
	public void process1() {
		List<String> list = Arrays.asList("A", "D", "B", "C", "E");

		// �֐��^�C���^�[�t�F�[�X�̈����̃��\�b�h���Q�Ƃ���ꍇ
		System.out.println("�����_��");
		list.stream()
				// �󂯎�����v�f�̒l���������ɕϊ�
				.map(ValueBase -> ValueBase.toLowerCase())
				// ��1�����Ƃ��Ă���String�̗v�f��
				// ���̗v�f������compareTo���\�b�h�ő�2�����̗v�f��
				// ��r���Č��ʂ�Ԃ�
				.sorted((value1, value2) -> value1.compareTo(value2))
				// �Ō�ɗv�f���o��
				.forEach(System.out::println);

		// ��L�̃����_���ƍs���Ă��鏈���͓���
		System.out.println("���\�b�h�Q��");
		list.stream()
			.map(String::toLowerCase)
			.sorted(String::compareTo)
			.forEach(System.out::println);
	}

}

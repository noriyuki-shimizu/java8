package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream API��p�������W�b�N�N���X.
 * 
 * @author Noriyuki-Shimizu
 */
public class ProcessStream {
	
	/** this�N���X */
	private static ProcessStream processStream = new ProcessStream();
	
	/**
	 * �V���O���g���p�^�[��.
	 * 
	 * @return �C���X�^���X�����ꂽthis�N���X
	 */
	public static ProcessStream getInstance() {
		return processStream;
	}
	
	/**
	 * StreamAPI�ł̏�������.
	 */
	public void process1() {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		
		// ���X�g�̒��g��2�{���ĕ\������
		integerList.stream()
			// map: �v�f�̕ϊ�
			.map(i -> i*2)
			// filter: �v�f�̍i�荞��
			.filter(i -> i%4 == 0)
			// forEach: ���[�v
			.forEach(System.out::println);
		
		// ���s
		System.out.println();
		
		Stream<String> stream1 = Stream.of("��", "��", "��", "��", "��");
		Stream<String> stream2 = Stream.of("�A", "�C", "�E", "�G", "�I");
		// ���񏈗�
		Stream<String> parallelStream = stream1.parallel();
		
		Stream<String> concatStream = Stream.concat(parallelStream, stream2);
		concatStream.forEach(System.out::println);
	}
	
	/**
	 * Stream API��p����FizzBuss���.
	 */
	public void fizzBuzz() {
		// �����l�ݒ�
		List<Integer> numList = new ArrayList<Integer>();
		for(int i=1; i<=100; i++) {
			numList.add(i);
		}

		// ����
		numList.stream()
			// map�ɂ��AFizzBuss�̒��o���s��
			.map(num -> {
				if(num % 3 == 0) {
					return "Fizz";
				} else if(num % 5 == 0){
					return "Buzz";
				} else {
					return String.valueOf(num);
				}
			})
			// ���ʂ̏o��
			.forEach(System.out::println);
	}

}

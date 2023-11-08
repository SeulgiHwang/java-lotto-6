package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import camp.nextstep.edu.missionutils.Randoms;

public class Lotto {
	//변수선언(numbers)
    private final List<Integer> numbers; //로또 입력번호

	//정수 numbers 리스트의 유효성검사 후 numbers변수에 저장
    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }
    
    //validate메서드는 주어진 리스트가 숫자가 6개인지 확인
    //X: IllegalArgumentException 예외발생시킴
    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // 랜덤숫자범위 1-45 6개 
    public void limitNumbers() {
    	//List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        List<Integer> randomNumbers;
        do {
            randomNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        } while (hasDuplicates(randomNumbers));
    }

    
    //보너스 번호도 같지않아야함
    public void bonusNumbers() {
    	//List<Integer> bonusNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 1);
        List<Integer> bonusNumbers;
        do {
            bonusNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 1);
        } while (hasDuplicates(bonusNumbers) || numbers.containsAll(bonusNumbers));
    }
    
    //중복되지않게 설정
    private boolean hasDuplicates(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        return uniqueNumbers.size() < numbers.size();
    }
    
    //변수 Private가져다 쓰기
    public List<Integer> getNumbers() {
        return numbers;
    }
}


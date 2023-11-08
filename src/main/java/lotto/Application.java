package lotto;

import java.util.List;
import java.util.Scanner;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import lotto.Lotto;

public class Application {
    public static void main(String[] args) {
    //사용자 입력넘버 (numbers)
    //사용자 보너스 넘버 bonusNumber
    final int perAmount=1000; //로또 장당구입금액
    //int buyAmount=0;	//로또 총구입금액
    //int n = buyAmount/perAmount;//로또 구입수량
    int n;
    int matchNumbers=0; //randomNumbers 일치갯수
    int matchBonusNumber=0; //bonusNumber 일치갯수
    int bonusNumber; //보너스 넘버수
    
      //1.로또 구입금액 입력받기 
      System.out.println("구입금액을 입력해주세요");
      Scanner scanner = new Scanner(System.in);
      int buyAmount = scanner.nextInt();
      
      //2.구입금액만큼 n번 로또 입력
      
      //3.n개만큼 구매했습니다
      System.out.println(n+"n개만큼 구매했습니다");
      //4.n개만큼 각 6자리숫자 출력(오름차순으로 정렬)
      
      //5.랜덤수 n개만큼 6개 output
      
      //6.랜덤수와 입력수 비교
      
      //7.당첨갯수 알려주기 
      
      //8수익률계산(둘째자리숫자 반올림)
      

    	
    	
    	//금액 입력 오류시[Error]에러메세지 출력후, 다시 입력받기
    	System.out.println("[Error] 다시입력해주세요");
    }

      
      
}

주의사항 : 1. Enum정의해서 사용
		2. else사용X, switch 사용X
		3. 도메인 로직에 단위테스트 구현???
		4. 로또에 Randoms함수 구현
		5. Console값으로 입력값
		6. 'Lotto'클래스를 활용및 구현
			6-1.private변경 X
			6-2.필드를 추가 X
			6-3.패키지 변경가능
[핵심로직구현]
로또 구입금액 =  buyAmount
로또 장당구입금액 =perAmount
로또 산 수량 = n
입력넙버 = numbers
randomNumbers 일치갯수 = matchNumbers
bonusNumber 일치갯수 = matchBonusNumber
랜덤수(6) = randomNumbers
보너스랜덤수 = bonusNumber

1.[주의사항 코드로 짜기]
Lotto.java에서
	1.숫자범위 1-45
	2.중복여부(6개숫자와+보너스숫자)
	3.그외의값 ->오류
	4.금액 입력 오류시[Error]에러메세지 출력후, 
		다시 입력받기
		
	
2. 로또 구입금액을 입력받기
3. 구입금액만큼 n번 로또 입력
4. n개 만큼 구매했습니다 문구띄운후
5. n개만큼 각 6자리숫자 출력(오름차순으로 정렬)
6. 랜덤수 n개만큼 6개 output
7. 랜덤수와 입력수 비교
8. 당첨내역 출력
9. 수익률 계산. 둘째자리숫자 반올림

	
	
[UI구현]
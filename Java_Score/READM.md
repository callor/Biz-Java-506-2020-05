# 자바 콘솔 성적처리

> 키보드에서 학번, 국어, 영어, 수학 점수를 입력받고 평균, 총점 계산해서 성적리스트를 출력

### 키보드 입력 : Scanner
- 데이터를 저장 이동 : ScoreVO
* 학번, 국어, 영어, 수학, 총점, 평균 필드변수로 설정
* 학번 : String 001  ~ 
* 각과목 성적 : int
* 총점 : int
* 평균 : float

### ScoreService01 
- inputScore : 한 학생의 성적을 입력받아서 scoreList 저장하는 method
* 한 학생의 성적을 입력받는 과정에서 
* 학번 부분에서 END 문자열을 입력하면 입력을 마치는(중단하도록)
- main() method에서는 while() 학생성적을 무한대로 입력받고, 
* 만약 scoreService.inputSocre() method false return 하면 
* 입력을 중단하고 현재 입력된 학생까지 성적리스트를 출력하도록 
* 학생의 성적을 입력할때 만약 문자열로 입력하면 해당과목은 
* 일단 0점으로 임시등록, 오류가 나지 않도록 try 처리를 한다.







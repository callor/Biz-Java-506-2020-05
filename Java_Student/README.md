# 파일에 Text 기록하기
* java에서는 파일에 text를 기록하는 방법이 여러가지 있다.
* 이중 가장 쉽게 파일에 저장하는 방법으로 PrintStream 클래스가 있다.
* PrintStream 클래스는 콘솔 출력 Stream인 System.out과 부모가 같다.
* PrintStream outPut = System.out; 를 사용하면 outPut 객체를 사용하여
* Console에 text를 출력할수 있다.
* PrintStream outPut = new PrintStream(파일이름); 으로 PrintStream객체를 재 정의 하면, Console에 출력될 결과를 "파일이름" 파일에 text로 기록할수 있다.

* PrintStream outPut = new PrintStream(파일이름) 생성코드는 반드시 try-catch로 exception Handling을 수행해야 한다.

* 프로젝트의 패키지(폴더)에 파일을 저장하위해 파일 이름을 작성할때, 
* 일일이 타이핑 하지 않고 
* 이미 있는 파일에서 Copy Qualified Name 명령을 수행하여 
* 파일경로와 파일명을 복사하고 작성할 파일 이름으로 "변경" 하여 사용하자

# Text file, BIN(Binary, 이진) file

### Text file
* 메모장으로 파일을 열었을때 일반 문자열로 쉽게 읽을수 있는 파일
* 파일에 기록된 값이 문자열의 ASCII 코드로 저장된 파일
* 파일이름.txt 등의 확장자를 가진다.
* Text file인지 알아보려면 윈도우의 메모장으로 파일을 열어보면 된다.
* java에서 어떤 데이터를 text file에 기록할때 여러가지 클래스들의 도움을 받을 수 있다.
* 그중에 Print* 시작되는 클래스가 사용법이 매우 쉽다.
* System.out.println() method는 PrintStream 클래스에 내장된 콘솔 출력 method이다
* System.out 대신 파일을 대상으로 출력하면 Text를 file에 기록할 수 있다.

### BIN file
* 메모장으로 파일을 열었을때 이상한 기호들이 보이는 파일
* 이진수들의 나열로 만들어진 파일
* 이미지, 동영상, 음악, hwp, doc, xls, ppt, ps 등 종류가 매우 다양하다.
* BIN 파일을 열어서 내용을 확인하려면 그 파일을 열수 있는 어플리케이션이 컴퓨터에 설치되어 있어야 한다.
* sublime text로 파일을 열면 16진수로 되어 있는 데이터 나열을 볼수 있다.








// NotNaturalNumberクラスの定義
class NotNaturalNumber extends RuntimeException{
    NotNaturalNumber(int n){ super("自然数ではない："+ n);}
}


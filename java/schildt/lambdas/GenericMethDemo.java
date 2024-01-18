package lambdas;

interface Func<T> {
    boolean func(T v1, T v2);
}

class Val {
    int v;

    public Val(int v) {
        this.v = v;
    }

    public boolean equals(Val v) {
        return this.v == v.v;
    }
}

public class GenericMethDemo {

    public static void main(String[] args) {
        Val[] vals = new Val[] { new Val(1), new Val(2), new Val(3), new Val(4) };
        Func<Val> matchingFunc = Val::equals;
        Val v = new Val(2);
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (matchingFunc.func(v, vals[i]))
                count++;
        }
        System.out.println(count);
    }
}

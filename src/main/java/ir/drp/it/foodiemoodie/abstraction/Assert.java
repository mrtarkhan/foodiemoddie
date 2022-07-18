package ir.drp.it.foodiemoodie.abstraction;

public abstract class Assert {

    public static void notNull(Object obj) {
        if (obj == null)
            throw new IllegalArgumentException("مقدار آیتم الزامی است.");
    }

    public static void hasData(Object obj) {
        if (obj == null)
            throw new IllegalArgumentException("آیتمی با این مشخصات یافت نشد");
    }

}
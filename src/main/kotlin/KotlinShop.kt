interface KotlinShop<T> {

    fun sell(commodity: T)

    fun <E> recycle(commodity: T): E
}
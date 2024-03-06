interface KotlinOutIn<out T, in E> {

    /**
     * T：只能用在返回值
     * E：只能用在参数
     */
    fun outFun(): T

    fun inFun(data: E)
}
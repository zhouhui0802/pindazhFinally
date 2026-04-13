package com.itheima.pinda.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 树接口
 *
 * @param <T>
 * @param <I>
 */
/*泛型 <T, I extends Serializable>
这是两个通用类型占位符，好处是：一套接口，所有实体类通用。
        ① T
代表当前节点自己的类型比如：Menu、Dept、Category
② I extends Serializable
代表主键 ID 的类型*/
public interface ITreeNode<T, I extends Serializable> {

    /**
     * 添加
     *
     * @param node
     */
//    void add(T node);

    /**
     * 获取id
     *
     * @return
     */
    I getId();

    /**
     * 获取父id
     *
     * @return
     */
    I getParentId();

    /**
     * 获取子类
     *
     * @return
     */
    List<T> getChildren();

    /**
     * 设置子类
     *
     * @param children
     */
    void setChildren(List<T> children);

    /**
     * 初始化子类
     */
    default void initChildren() {
        if (getChildren() == null) {
            this.setChildren(new ArrayList<>());
        }
    }
}

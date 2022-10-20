package com.likelion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
        //st.pop();

        //st.pop() 비어있을떈?
        //Exception 예외의 검증
        assertThrows(EmptyStackException.class,()->{
            st.pop();
        });
    }

    @Test
    void isEmpty() {
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void realStack(){
        Stack<Integer> st = new Stack<>(); //실제 util에 있는 stack
        //st.pop(); //java.util.EmptyStackException 발생. 당연함. 아무 것도 없는데 뭘 pop해
        assertThrows(EmptyStackException.class, () -> {
            st.pop();
        });
    }

}

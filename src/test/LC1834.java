import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LC1834 {

    private LC1834_SingleThreadedCPU solution = new LC1834_SingleThreadedCPU();

    @Test
    void getOrder1(){
        int[][] tasks = {{1,2},{2,4},{3,2},{4,1}};
        int[] sol = {0,2,3,1};
        int[] res = solution.getOrder(tasks);
        assertArrayEquals(sol,res);
    }

    @Test
    void getOrder2(){
        int[][] tasks = {{7,10},{7,12},{7,5},{7,4},{7,2}};
        int[] sol = {4,3,2,0,1};
        int[] res = solution.getOrder(tasks);
        assertArrayEquals(sol,res);


    }
}


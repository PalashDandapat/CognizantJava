package org.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class mokito_excercise1_Mocking_and_StubbingTest {
    @Test
    public void externalApiTest(){
        mokito_excercise1_Mocking_and_Stubbing.ExternalApi mockApi=
               mock(mokito_excercise1_Mocking_and_Stubbing.ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Data");
        mokito_excercise1_Mocking_and_Stubbing_MYSERVICE service=new mokito_excercise1_Mocking_and_Stubbing_MYSERVICE(mockApi);

        String result=service.fetchData();
        assertEquals("Mock Data",result);

    }

}
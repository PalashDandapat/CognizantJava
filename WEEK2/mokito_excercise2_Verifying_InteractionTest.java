package org.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class mokito_excercise2_Verifying_InteractionTest {
    @Test
    public void externalApiTest(){
        mokito_excercise2_Verifying_Interaction.ExternalApi mockApi=
               mock(mokito_excercise2_Verifying_Interaction.ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        mokito_excercise2_Verifying_Interaction_MYSERVICE service=new mokito_excercise2_Verifying_Interaction_MYSERVICE(mockApi);

        String result=service.fetchData();
        assertEquals("Mock Data",result);
        verify(mockApi).getData();

    }

}
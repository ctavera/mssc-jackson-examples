package da.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
//        String json = "{\"id\":\"c0a72eef-ed94-4151-a21c-9e8964593faa\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2020-12-19T15:01:10.889509-05:00\",\"lastUpdatedDate\":\"2020-12-19T15:01:10.889509-05:00\"}\n";
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"2020-12-19T20:45:21-0500\",\"lastUpdatedDate\":\"2020-12-19T20:45:21.2079355-05:00\",\"myLocalDate\":\"20201219\",\"beerId\":\"05acbf4e-e2e2-4dee-a9ab-b32e59ee252c\"}\n";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
}
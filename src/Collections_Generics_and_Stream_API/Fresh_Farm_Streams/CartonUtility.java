package Collections_Generics_and_Stream_API.Fresh_Farm_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class CartonUtility {
    private List<Carton> cartonList;

    public CartonUtility() {
        this.cartonList = new ArrayList<>();
    }

    public List<Carton> getCartonList() {
        return cartonList;
    }

    public void setCartonList(List<Carton> cartonList) {
        this.cartonList = cartonList;
    }

    public Stream<Carton> convertToStream() {
        return cartonList.stream();
    }

    public Carton findMax(Stream<Carton> stream1) {
        return stream1.max((c1, c2) -> Integer.compare(c1.getQuantity(), c2.getQuantity())).orElse(null);
    }
}


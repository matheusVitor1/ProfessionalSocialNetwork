package social.network.spring.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import social.network.spring.dtos.AddressDto;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep" )
public interface AddressFeign {
    @GetMapping("{cep}/json")
    AddressDto searchAddressCep(@PathVariable("cep") String cep);
}
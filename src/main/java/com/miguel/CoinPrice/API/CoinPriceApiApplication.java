package com.miguel.CoinPrice.API;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CoinPriceApiApplication {

	private static final Logger log = LoggerFactory.getLogger(CoinPriceApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CoinPriceApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			//Coin coin = restTemplate.getForObject(
			//"https://api.n.exchange/en/api/v1/price/BTCLTC/latest/?market_code=nex", Coin.class);
			//log.info(coin.toString());
			Coin[] crypto = restTemplate.("https://api.n.exchange/en/api/v1/price/BTCLTC/latest/?market_code=nex", Coin[].class);
		};
	}

	@Scheduled
	public void report(){
		RestTemplate restTemplate = new RestTemplate();

	}

}

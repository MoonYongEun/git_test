package index.dao;

import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(value={"indexSQL"})
public class indexDAOMyBatis implements indexDAO {

	@Override
	public void insert(Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}

}

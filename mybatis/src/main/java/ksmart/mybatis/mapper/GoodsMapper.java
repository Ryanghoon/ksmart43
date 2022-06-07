package ksmart.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ksmart.mybatis.dto.Goods;

@Mapper
public interface GoodsMapper {
	//상품 등록
	public int addGoods(Goods goods);
	
	//상품목록조회
	public List<Goods> getGoodsList(); 
	
	
}

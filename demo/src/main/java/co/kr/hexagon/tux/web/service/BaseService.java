package co.kr.hexagon.tux.web.service;
import org.springframework.stereotype.Service;

import co.kr.hexagon.tux.web.vo.TransactionVO;


@Service
public interface BaseService {
	public void transaction(TransactionVO tVo);
}

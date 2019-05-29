package com.hw.web.server.news;/**
 * Created by robin on 2019/5/27.
 */

import com.hw.bean.BO.QueryBaseNewsByPrimaryKey;
import com.hw.bean.BO.QueryBaseNewsPage;
import com.hw.bean.DTO.ADDBaseNewsDTO;
import com.hw.bean.DTO.ModifyBaseNewsDTO;
import com.hw.bean.DTO.RemoveNewsDTO;
import com.hw.bean.PO.BaseNewsPO;
import com.hw.bean.VO.BaseNewsVO;
import com.hw.services.BaseNewsService;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.PropertiesCopyUtil;
import com.hw.utils.ResultDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-27 12:14
 * @description: 管理端 新闻公告 控制层
 **/

@Api(value = "[oss] 系统管理 - 新闻公告管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/news")
@Slf4j
public class SysNewsController implements Serializable {
    private static final long serialVersionUID = -8354063303894545846L;

    @Autowired
    private BaseNewsService baseNewsService;

    @ApiOperation(value = "发布公告")
    @PostMapping(value = "publish")
    public BaseResultDTO publishNews(@RequestBody @Validated @ModelAttribute(value = "")ADDBaseNewsDTO addBaseNewsDTO){
        BaseNewsPO baseNewsPO = PropertiesCopyUtil.copyProperties(addBaseNewsDTO,BaseNewsPO.class);
        return baseNewsService.addBaseNews(baseNewsPO);
    }

    @ApiOperation(value = "修改公告")
    @PostMapping(value = "modify")
    public BaseResultDTO modifyNews(@RequestBody @Validated @ModelAttribute(value = "")ModifyBaseNewsDTO modifyBaseNewsDTO){
        BaseNewsPO baseNewsPO = PropertiesCopyUtil.copyProperties(modifyBaseNewsDTO,BaseNewsPO.class);
        return baseNewsService.modifyBaseNews(baseNewsPO);
    }

    @ApiOperation(value = "获取公告列表(分页)")
    @PostMapping(value = "getNewsPage")
    public BatchResultDTO<BaseNewsVO> getNewsPage(@RequestBody @Validated @ModelAttribute(value = "")QueryBaseNewsPage queryBaseNewsPage){
        return baseNewsService.getBaseNewsList(queryBaseNewsPage);
    }

    @ApiOperation(value = "获取公告明细")
    @PostMapping(value = "getNewsInfo")
    public ResultDTO<BaseNewsVO> getNewsInfo(@RequestBody @Validated @ModelAttribute(value = "")QueryBaseNewsByPrimaryKey queryBaseNewsByPrimaryKey){
        return baseNewsService.getbaseNews(queryBaseNewsByPrimaryKey);
    }

    @ApiOperation(value = "设置公告状态")
    @PostMapping(value = "setNewsStatus")
    public BaseResultDTO setNewsStatus(@RequestBody @Validated @ModelAttribute(value = "")RemoveNewsDTO removeNewsDTO){
        BaseNewsPO baseNewsPO = PropertiesCopyUtil.copyProperties(removeNewsDTO,BaseNewsPO.class);
        return baseNewsService.resetNewsStatus(baseNewsPO);
    }


}

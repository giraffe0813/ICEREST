package com.cybermkd.route.core;

import com.cybermkd.common.entity.CaseInsensitiveMap;

import java.util.Map;

/**
 * @author Dreampie
 * @date 2015-08-21
 * @what
 */
public class Headers extends Params {
  public Headers(final Map<String, String> headers) {
    super(new CaseInsensitiveMap<Object>() {{
      putAll(headers);
    }});
  }
}

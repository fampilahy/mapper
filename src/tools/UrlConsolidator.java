package tools;

import org.apache.commons.lang3.StringUtils;

public class UrlConsolidator {
   final String domain;

   public UrlConsolidator(final String domain) {
      this.domain = domain;
   }

   public String consolidateUrl(final String inputUrl) {
      if (!StringUtils.isBlank(inputUrl) && !inputUrl.startsWith("http")) {
         String url = inputUrl.replace("//", "/");
         if (domain.endsWith("/") && url.startsWith("/")) {
            return domain + (url.startsWith("/") ? url.substring(1) : url);
         } else if (!domain.endsWith("/") && !url.startsWith("/")) {
            return domain + "/" + url;
         }
         return domain + url;
      }
      return inputUrl;
   }

}
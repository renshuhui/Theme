package com.rensh.theme;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/13.
 */

public class ResourceUtils {
    public static Map<String,Drawable> getTextViewBackGroundDrawable(Resources resources,int type) {
        Map<String,Drawable> map = new HashMap<String,Drawable>();
        if (map == null)
            map = new HashMap<String,Drawable>();
        else
            map.clear();
        map.put("theme_bar_bg_1",resources.getDrawable(R.mipmap.theme_bar_bg_1));
        map.put("theme_bar_bg_pitch",resources.getDrawable(R.mipmap.theme_bar_bg_pitch));
        map.put("theme_bar_mic",resources.getDrawable(R.mipmap.theme_bar_mic));
        map.put("theme_comp_2",resources.getDrawable(R.mipmap.theme_comp_2));
        map.put("theme_home_bg_box",resources.getDrawable(R.mipmap.theme_home_bg_box));
        map.put("theme_home_ic_switch_1",resources.getDrawable(R.mipmap.theme_home_ic_switch_1));
        map.put("theme_id_bg",resources.getDrawable(R.mipmap.theme_id_bg));
        map.put("theme_install_button_duo_p",resources.getDrawable(R.mipmap.theme_install_button_duo_p));
        map.put("theme_install_button_liang_p",resources.getDrawable(R.mipmap.theme_install_button_liang_p));
        map.put("theme_local_ic_paay_bar",resources.getDrawable(R.mipmap.theme_local_ic_paay_bar));
        map.put("theme_nav_bg2",resources.getDrawable(R.mipmap.theme_nav_bg2));
        map.put("theme_nav_bimianyongdu",resources.getDrawable(R.mipmap.theme_nav_bimianyongdu));
        map.put("theme_nav_biranggaosu",resources.getDrawable(R.mipmap.theme_nav_biranggaosu));
        map.put("theme_nav_dulun",resources.getDrawable(R.mipmap.theme_nav_dulun));
        map.put("theme_nav_ic_location",resources.getDrawable(R.mipmap.theme_nav_ic_location));
        map.put("theme_nav_jindu_p",resources.getDrawable(R.mipmap.theme_nav_jindu_p));
        map.put("theme_nav_lights",resources.getDrawable(R.mipmap.theme_nav_lights));
        map.put("theme_nav_like_p",resources.getDrawable(R.mipmap.theme_nav_like_p));
        map.put("theme_nav_many",resources.getDrawable(R.mipmap.theme_nav_many));
        map.put("theme_nav_money",resources.getDrawable(R.mipmap.theme_nav_money));
        map.put("theme_nav_more_n",resources.getDrawable(R.mipmap.theme_nav_more_n));
        map.put("theme_nav_more_p",resources.getDrawable(R.mipmap.theme_nav_more_p));
        map.put("theme_nav_san",resources.getDrawable(R.mipmap.theme_nav_san));
        map.put("theme_nav_shaoshoufei",resources.getDrawable(R.mipmap.theme_nav_shaoshoufei));
        map.put("theme_nav_tuijian",resources.getDrawable(R.mipmap.theme_nav_tuijian));
        map.put("theme_nav_xianxin",resources.getDrawable(R.mipmap.theme_nav_xianxin));
        map.put("theme_news_button_bg",resources.getDrawable(R.mipmap.theme_news_button_bg));
        map.put("theme_news_button_bg_2",resources.getDrawable(R.mipmap.theme_news_button_bg_2));
        map.put("theme_news_button_bg_2_p",resources.getDrawable(R.mipmap.theme_news_button_bg_2_p));
        map.put("theme_news_button_bg_p",resources.getDrawable(R.mipmap.theme_news_button_bg_p));
        map.put("theme_pop_voice_ic_3_02",resources.getDrawable(R.mipmap.theme_pop_voice_ic_3_02));
        map.put("theme_pop_voice_ic_3_03",resources.getDrawable(R.mipmap.theme_pop_voice_ic_3_03));
        map.put("theme_pop_voice_ic_3_04",resources.getDrawable(R.mipmap.theme_pop_voice_ic_3_04));
        map.put("theme_qplayauto_ic_play_n",resources.getDrawable(R.mipmap.theme_qplayauto_ic_play_n));
        map.put("theme_qq_bg",resources.getDrawable(R.mipmap.theme_qq_bg));
        map.put("theme_query_bg",resources.getDrawable(R.mipmap.theme_query_bg));
        map.put("theme_voice_svwlink",resources.getDrawable(R.mipmap.theme_voice_svwlink));
        map.put("theme_weather_bg2",resources.getDrawable(R.mipmap.theme_weather_bg2));
        map.put("theme_weather_button_bg",resources.getDrawable(R.mipmap.theme_weather_button_bg));
        map.put("theme_weather_line2",resources.getDrawable(R.mipmap.theme_weather_line2));
        map.put("theme_weather_menu",resources.getDrawable(R.mipmap.theme_weather_menu));
        map.put("theme_weather_switch_bg",resources.getDrawable(R.mipmap.theme_weather_switch_bg));
        map.put("theme_weather_updivider",resources.getDrawable(R.mipmap.theme_weather_updivider));
        map.put("theme_welink_qplay_qqmusic_playa",resources.getDrawable(R.mipmap.theme_welink_qplay_qqmusic_playa));
        map.put("theme_welink_qplay_qqmusic_playb",resources.getDrawable(R.mipmap.theme_welink_qplay_qqmusic_playb));
        map.put("theme_welink_qplay_qqmusic_playc",resources.getDrawable(R.mipmap.theme_welink_qplay_qqmusic_playc));
        map.put("theme_ximalaya_like",resources.getDrawable(R.mipmap.theme_ximalaya_like));
        map.put("theme_music_seekbar_horizontal",resources.getDrawable(R.drawable.theme_music_seekbar_horizontal));
        map.put("theme_voice_ine_p",resources.getDrawable(R.mipmap.theme_voice_ine_p));
        map.put("theme_navi_limit_changcity",resources.getDrawable(R.mipmap.theme_navi_limit_changcity));
        map.put("theme_navi_leftborad_home_bj_p",resources.getDrawable(R.mipmap.theme_navi_leftborad_home_bj_p));
        map.put("theme_navi_naviseting_middle_02_p",resources.getDrawable(R.mipmap.theme_navi_naviseting_middle_02_p));
        map.put("theme_icon_bt_bg",resources.getDrawable(R.mipmap.theme_icon_bt_bg));
        map.put("theme_nav_shoufeibg_p",resources.getDrawable(R.mipmap.theme_nav_shoufeibg_p));
        map.put("theme_navi_leftborad_home_bj_p",resources.getDrawable(R.mipmap.theme_navi_leftborad_home_bj_p));
        map.put("welink_navi_route_progress_style",resources.getDrawable(R.drawable.welink_navi_route_progress_style));
        map.put("theme_voice_line",resources.getDrawable(R.mipmap.theme_voice_line));
        map.put("theme_ic_recording",resources.getDrawable(R.mipmap.theme_ic_recording));
        map.put("theme_voice_ic_mic_recording",resources.getDrawable(R.mipmap.theme_voice_ic_mic_recording));
        map.put("theme_voice_ic_mic_recording_1",resources.getDrawable(R.mipmap.theme_voice_ic_mic_recording_1));
        map.put("theme_voice_ic_mic_recording_2",resources.getDrawable(R.mipmap.theme_voice_ic_mic_recording_2));
        map.put("theme_ic_uploading",resources.getDrawable(R.mipmap.theme_ic_uploading));
        map.put("theme_ic_uploading1",resources.getDrawable(R.mipmap.theme_ic_uploading1));
        map.put("theme_ic_uploading2",resources.getDrawable(R.mipmap.theme_ic_uploading2));
        map.put("theme_ic_uploading3",resources.getDrawable(R.mipmap.theme_ic_uploading3));
        map.put("theme_xima_album_song_fav",resources.getDrawable(R.mipmap.theme_xima_album_song_fav));
        map.put("theme_nav_ic_collect_p",resources.getDrawable(R.mipmap.theme_nav_ic_collect_p));
        map.put("theme_nav_money",resources.getDrawable(R.mipmap.theme_nav_money));

        return map;
    }
    public static Map<String,Integer> getThemeColor(Resources resources){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("themeTextColor",resources.getColor(R.color.themeTextColor));
        return map;
    }
}

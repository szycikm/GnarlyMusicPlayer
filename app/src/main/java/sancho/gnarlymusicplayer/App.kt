package sancho.gnarlymusicplayer

import android.app.Application
import androidx.recyclerview.widget.RecyclerView

class App: Application()
{
	companion object
	{
		var currentTrack: Int = RecyclerView.NO_POSITION
		lateinit var queue: MutableList<Track>
		var mediaPlaybackServiceStarted = false

		const val REQUEST_READ_STORAGE = 42

		const val PREFERENCE_BOOKMARKS = "sancho.gnarlymusicplayer.preference.bookmarks"
		const val PREFERENCE_QUEUE = "sancho.gnarlymusicplayer.preference.queue"
		const val PREFERENCE_LASTDIR = "sancho.gnarlymusicplayer.preference.lastdir"
		const val PREFERENCE_ACCENTCOLOR = "sancho.gnarlymusicplayer.preference.accentcolor"
		const val PREFERENCE_CURRENTTRACK = "sancho.gnarlymusicplayer.preference.currenttrack"

		const val BUNDLE_LASTSELECTEDTRACK = "sancho.gnarlymusicplayer.bundle.lastselectedtrack"

		const val ACTION_START_PLAYBACK_SERVICE = "sancho.gnarlymusicplayer.action.startplayback"
		const val ACTION_STOP_PLAYBACK_SERVICE = "sancho.gnarlymusicplayer.action.stopplayback"
		const val ACTION_REPLAY_TRACK = "sancho.gnarlymusicplayer.action.replaytrack"
		const val ACTION_PREV_TRACK = "sancho.gnarlymusicplayer.action.prevtrack"
		const val ACTION_PLAYPAUSE = "sancho.gnarlymusicplayer.action.playpause"
		const val ACTION_NEXT_TRACK = "sancho.gnarlymusicplayer.action.nexttrack"

		const val NOTIFICATION_CHANNEL_ID = "sancho.gnarlymusicplayer.notificationthing"
		const val NOTIFICATION_ID = 420

		// from https://developer.android.com/guide/topics/media/media-formats
		val SUPPORTED_FILE_EXTENSIONS = arrayOf(
			"3gp",
			"mp4",
			"m4a",
			"aac",
			"ts",
			"flac",
			"gsm",
			"mid",
			"xmf",
			"mxmf",
			"rtttl",
			"rtx",
			"ota",
			"imy",
			"mp3",
			"mkv",
			"wav",
			"ogg"
		)

		val COLOR_RESOURCES = arrayOf(
			R.style.AppThemeBlack,
			R.style.AppThemeGreen,
			R.style.AppThemeBlu,
			R.style.AppThemeCyan,
			R.style.AppThemeRed,
			R.style.AppThemeOrang,
			R.style.AppThemePurpl,
			R.style.AppThemePink,
			R.style.AppThemeMacintoshPlus)

		val COLOR_NAMES = arrayOf(
			"Blacc",
			"Poison",
			"Blu",
			"Ice cold",
			"Red",
			"Orang",
			"Purpl",
			"Pink",
			"Macintosh Plus")
	}
}
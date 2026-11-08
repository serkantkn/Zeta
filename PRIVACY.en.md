# Zeta — Privacy Policy

Last updated: 8 November 2026 · Version 1.11

## In short

Zeta has no server. None of your data reaches us, because there is nowhere for it to
go. There is no advertising network in the app, no analytics, no crash reporting and no
account. Everything it reads — your contacts, your messages, your pictures, your notes —
stays on your phone.

The only things that leave are the smallest pieces needed to do something you asked for:
approximate location for the weather, a track name for lyrics, what you type for search
suggestions, the topics and sites you chose for the news; if you want, the question whether a newer version is out. Each one is listed below.

## What stays on the phone

None of this leaves your device. Every permission is asked for only when the part of the app
that needs it is used; refuse one and that part stops working, the rest carries on.

| What | Why |
|---|---|
| Contacts | The People hub, the name of whoever is calling, people pinned to Start |
| Call log and phone state | The Phone hub, missed-call notifications, voicemail |
| SMS / MMS | The Messaging hub, message previews on the live tile |
| Calendar | The Calendar hub and the agenda tile |
| Photos, video, music, files | The Pictures, Music and Files hubs |
| Camera and microphone | The Camera hub, voice notes, dictation in the keyboard |
| Notifications | Counts and previews on live tiles |
| Installed apps and usage stats | The app list, and which apps you use most |
| What you type on the keyboard | Word prediction and correction |
| Precise location *(optional)* | Only to show the name of the Wi-Fi network you are on, in settings → connections: Android gives a network's name only to apps holding this. Your position is not read with it; the weather uses a rounded, approximate one. A website you allow location in the browser may get it precisely, as in any browser. |
| Nearby devices *(optional)* | Only to show the Bluetooth devices connected now: their names in settings → connections, and their names and battery levels on the battery widget. Nothing is scanned for, paired or connected, and none of it leaves the phone. |
| Physical activity *(optional)* | Only for the steps widget on Start: today's step count is read from the phone's step counter. The count and its day are kept on the phone and sent nowhere; no other activity data is read. |
| TV listings *(optional, on a TV only)* | Only so that Start on a TV can show what you left part way in your other apps and the rows of picks those apps keep: what the apps wrote to the TV's own listings (the name, the episode, where you stopped, when you last watched it, the address of its picture, what opens it and the name of the row) is read. It is asked for once on Start, saying what it is for, and can be given later in settings → system. What is read stays on the TV and is sent nowhere. It is never asked for on a phone. |
| Open apps *(optional, through Shizuku)* | Only so that the screen of what is open can show the phone's other open apps too: if you install Shizuku and let Zeta use it, Android's list of recent apps (which apps are open) and the small screenshot the system keeps of each are read; an app you close there is taken off the list. The pictures stay in memory only while that screen is open; they are not saved and are sent nowhere. |
| Accessibility service *(optional)* | If you turn it on in settings: to see the volume keys for Zeta's volume bar; with the action center on, to find the status bar from the kind of windows on screen and to tell that Android's notification shade has opened from the system interface's window name; with "in place of recents" chosen, to see only the app and class name of the window that comes forward. The text of other apps' screens is not read; nothing is kept or sent. |
| Reading aloud | When you have a note, a news story or a web page read aloud, its text is given to the text-to-speech engine chosen on your phone; Zeta sends it nowhere else. What the engine does with it is up to its own terms. |

About the keyboard in particular: **nothing is learned from password fields**, the "do not
learn from this" flag apps set (private browsing, one-time codes) is honoured, and a clip a
password manager has marked sensitive is never written to the clipboard history.

## What leaves the phone

Each of these is optional and happens only when you use that feature. Nothing carries your
identity, your device id or an advertising id.

**Weather — open-meteo.com**
Your approximate location (latitude/longitude, rounded to about a kilometre), or the name of a city you searched for. No
account, nothing identifying.

**Lyrics and album art — lrclib.net, musicbrainz.org, coverartarchive.org, itunes.apple.com**
Only if you switched it on in settings. What is sent is the title, artist and album of the
track playing. Your file is never uploaded.

**Search suggestions — the search engine you chose (Google, Bing, DuckDuckGo, Yandex)**
What you type in the browser is sent as you type, to suggest completions. It can be switched
off in settings, and then nothing is sent.

**New version check — serkantkn.github.io (GitHub)**
Only in the APK downloaded from GitHub, and only if you want it. You are asked once on Start;
until you say "tell me", no request is made. If you say yes, then when the app comes to the front, at
most once a day, a small file on the site (latest.json) is fetched and the latest version's number is
compared with the installed one on the phone. The request carries no identity, no device number, not
your phone's model and not the installed version; its browser name is just "Zeta". GitHub, which hosts
the site, sees the IP address the request came from and when, as with any website; that falls under
GitHub's own privacy statement and does not reach us. If a newer version is out, a notification says
so; tapping it opens the version's page on GitHub, and the app downloads and installs nothing by itself.
Your answer is not backed up, so a new phone asks again; it is switched on and off in settings → about,
and switching it off forgets the version found. Zeta installed from Google Play never does this; Play
updates it.

**Email — the servers you enter**
The app connects straight to your IMAP/SMTP server. Nothing sits in between, and there is no
server of ours.

**Cloud files — the app connects to none itself**
When you open a file from the cloud in the Files hub, or save one there, Android's own file
picker is used: the cloud app on your phone (Google Drive, OneDrive, Dropbox…) brings it or takes
it. The app signs in to no cloud account and keeps no account details.

**News — news.google.com and the sites you follow**
Only when the news hub is opened, or while its tile is on Start. The feeds of the topics you chose come from Google News, in the edition of your phone's language and country; the RSS feeds of the sites you follow come straight from those sites. When you open a story, its picture and summary may be asked of the story's own page. No location, nothing identifying.

**Ad and tracker blocklist — raw.githubusercontent.com**
If blocking is on in the browser, Steven Black's open blocklist is downloaded once, then weekly and only on Wi-Fi. The file is fetched; nothing is sent.

**The browser**
Sites you visit are between you and them. The app does not sit in the middle and does not
report anywhere. With blocking on, the requests pages make to advertising and tracking servers are stopped on the phone. The icons on the start page's site tiles are asked of Google's icon service by the site's name. "Translate page" opens the page through Google Translate.

**Other apps' pictures on a TV — the addresses those apps gave**
Only if you let the TV's listings be read. When Start shows other apps' rows, each one's picture is asked of the address its app wrote to the listings (usually the app's own server). Only the picture is asked for; nothing about you is sent.

## Between your phone and your TV (the phone link)

Zeta also runs on a television. If you pair your phone with a TV on the same Wi-Fi
network, the phone tells that TV about incoming calls and messages, and the TV shows them in a
corner of the screen. Nothing is sent unless you pair the two.

- **What goes:** the caller's or sender's name (as in your contacts, or the number), the kind
  of notice (call, missed call, message), the name of the app a message came from and your
  phone's name. **The text of a message is not sent by default**; only if you turn on "send
  the message text too" on the phone do its first 300 characters go.
- **Where it goes:** only to the TV you paired, directly over your local network. There is no
  server in between; it does not go out to the internet and never reaches us.
- **How it is protected:** pairing uses a one-time six-digit code shown on the TV; every notice
  is encrypted (AES-GCM) with a key only those two devices hold, protected by the Android
  Keystore.
- **How it is read:** while Zeta is your default phone and SMS app it sees calls and texts
  itself; otherwise it reads them from your phone and messaging apps' notifications (this needs
  notification access). Messages from other apps such as WhatsApp are, if you choose, read from
  their notifications too.
- **What you send yourself:** when you use the phone as the TV's remote, or "Open on TV" in the
  share sheet, the keys you press, the words you type, the link or the picture you share go to the
  paired TV the same way - directly, encrypted, over your local network. The TV does what they ask
  and keeps nothing: a picture is held only until another one comes.
- **On the TV:** a notice is only shown, disappears after a few seconds and is not stored. The
  TV keeps only the names and keys of the phones paired with it.
- **Turning it off:** on the phone, settings → connections → TV link turns each kind off, or all
  of it; a paired device can be removed from either side.

## On a television

If you turn on the accessibility service on a TV, it is used for five things only: pressing the keys and
typing the words a phone you paired sends (into the text field selected on the TV, and nowhere else); catching
the remote's Home button; for a few seconds after the TV is turned on or wakes, seeing which app is in front
(its name alone) so Zeta can open in place of the TV's own home screen; opening the TV's power menu or putting it to sleep when you choose that in
the TV interface's shutdown panel, and showing a paired phone's notice over other apps. Nothing on
the screen is read, and nothing is recorded or sent.

**What you watch in other apps.** If you let it read the TV's listings (asked once on Start; later in
settings → system → your apps on the home screen), Zeta reads other apps' "continue watching" rows and
rows of picks from the TV's own listings - only those the apps left open to be read. They stay on the
TV and are sent nowhere; rows of apps you hid or put behind the child lock are not shown. As the TV's
own home screen does, Zeta also asks the apps to write their rows there.

**Your own videos on the TV's list** *(optional, off by default)*. If you turn on "put my videos in the
TV's continue watching" in settings → system, the name of each video left part way in Zeta's player,
where you stopped, its length, when you left it and a frame from where you stopped are written to the
TV's continue watching. The video's address on the phone or a drive is not written; the row opens it by an
id only Zeta knows. There the TV's home screens, and other apps you let read the TV's listings, can read
and show the name and where you stopped; the frame is lent only to home screens that may read the TV's
listings. What they do with them is governed by their own privacy terms. Zeta sends them nowhere, and
turning the switch off takes what it wrote off the list. If you clear Zeta's data the rows go the next
time Zeta runs; if you uninstall Zeta they go at once.

## Where it is kept

All of it stays in the app's own private storage, on your phone.

- **Email passwords and cloud tokens**: in a vault, AES-GCM, under a key held by the Android
  Keystore. The key never leaves the phone and is never backed up.
- **Locked notes**: the body is encrypted the same way. Even with root access to the phone,
  a locked note cannot be read.
- **Browsing history and downloads**: in a file of their own, excluded from backup.
- **The reading list, its offline copies and where you left each video**: in files of their own, excluded from backup.

## Backup

If Android's backup and device-transfer are on, the app's **appearance settings and Start
screen layout** are included. These are deliberately excluded and never leave the phone:
email accounts and cached messages, notes and their attachments, the keyboard's learned words
and clipboard history, cloud accounts, calendar entries, browsing history, the reading list, where you
left each video, the location you watch the weather for, and the password vault.

**The Pro trial.** When you start the 10-day trial, the moment it began (a date, nothing else) is kept
in the app's settings, in Google Play services' Block Store and, as a day, in the component settings
Android keeps for the app; the last is so that clearing the app's data does not start the trial again,
and it goes when the app is uninstalled. With the phone's backup on, the date survives an uninstall
and reinstall; with end-to-end encrypted backup it moves to a new phone with your Google account's
backup. Nothing identifying you, your account or your device is attached, and none of it comes to us.

## Children

The app is not directed at children and collects no age information.

## Deleting your data

Uninstalling removes everything the app kept. To clear it without uninstalling: Android
Settings → Apps → Zeta → Storage → Clear data. There is no account or record of yours
on our side to delete, because none is ever created.

## This website

Not the app, only the website (serkantkn.github.io/Zeta) counts how often its pages are opened. It uses
[GoatCounter](https://www.goatcounter.com), which sets no cookies, does not follow you across sites and does not
keep your IP address. All it counts is which page was opened, where the visit came from (the referring site), the
kind of browser, the screen size and roughly the country; a press of the download button is counted too. None of
it is shared or used for advertising. With "Do Not Track" on in your browser, or a blocker, you are not counted at all.

## Changes

If this policy changes, the date above is updated and the change is mentioned in the app's
"what's new" screen.

## Contact

Questions: **serkantkn5@gmail.com**
